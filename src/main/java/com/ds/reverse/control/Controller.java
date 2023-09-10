package com.ds.reverse.control;


import com.ds.reverse.mapper.CustomerMapper;
import com.ds.reverse.po.CustomerPO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@Api(tags = "测试接口")
public class Controller {

    @Autowired
    private CustomerMapper customerMapper;


    /**
     * http://localhost:8080/swagger-ui.html
     */
    @ApiOperation("")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void test() {
        log.info("TestController-测试接口运行开始");
        CustomerPO po = customerMapper.selectByPrimaryKey(1L);

        log.info("TestController-测试接口运行结束:po{}",po);
    }
}
