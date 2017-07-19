package cn.edu.whu.core.freemarker.extend;

import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by Fly on 2017/7/19.
 * 向返回至前台的Model中加一些通用的信息
 */
public class FreeMarkerViewExtend extends FreeMarkerView {
    @Override
    protected void exposeHelpers(Map<String, Object> model, HttpServletRequest request) throws Exception {
        //前台可以通过${basePath}获取对应的值
        model.put("basePath", request.getContextPath());
        super.exposeHelpers(model, request);
    }
}
