package com.hukai.huakaiprojectxproject.y2021;

import com.huakai.PlaywayInstance;
import com.huakai.annotation.CustomerAction;
import com.huakai.sdk.AbstractPlayway;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: huakai
 * @createTime: 2023/07/02 8:54
 * @description: todo
 * @version: 1.0
 */
@PlaywayInstance(value = "aTest", name = "aTest")
public class ATestPlayway extends AbstractPlayway {
    @CustomerAction(value = "query", name = "查询")
    public Object query(HttpServletRequest request) {
        return "aTest query method";
    }
}
