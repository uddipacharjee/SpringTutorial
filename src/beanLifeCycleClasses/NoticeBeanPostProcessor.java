package beanLifeCycleClasses;
import p1.Notice;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class NoticeBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object beanObj, String beanName) throws BeansException {
        System.out.println("Post Process Before Initialization method is called : Bean Name " + beanName);
        return beanObj;
    }

    @Override
    public Object postProcessAfterInitialization(Object beanObj, String beanName) throws BeansException {
        System.out.println("Post Process After Initialization method is called : Bean Name " + beanName);

        return beanObj;
    }
}

