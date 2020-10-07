package ${bussPackage}.controller#if($!controllerEntityPackage).${controllerEntityPackage}#end#if($!category).${category}#end;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.annotation.Validated;

/**
 * Project Name: ${projectName}
 * Functional description：${funcDesc}
 *
 * @author ${author}
 * @version 1.0
 * @date ${datetime}
 * @since JDK ${version}
 */
@Slf4j
@Validated
@RestController
@RequestMapping
public class ${className}Controller {



}
