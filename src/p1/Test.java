package p1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import javax.xml.transform.sax.SAXSource;

public class Test {
    public static void main(String[] args) {
        Resource resource=new ClassPathResource("applicationContext.xml");
        BeanFactory factory=new XmlBeanFactory(resource);

        Student student=(Student)factory.getBean("studentbean");
        System.out.println(student.toString());

        Teacher t=(Teacher) factory.getBean("teacher1");
        System.out.println(t.toString());
        //System.out.println();

        MarkSheet m=(MarkSheet) factory.getBean("ms");
        System.out.println(m.toString());

        Student s1=(Student) factory.getBean("student1");
        System.out.println(s1.toString());

        Student s2=(Student) factory.getBean("student2");
        System.out.println(s2.toString());

        Student s3=(Student) factory.getBean("student3");
        System.out.println(s3.toString());

        Class class1=(Class) factory.getBean("class");
        System.out.println(class1.toString());

        Director d= (Director) factory.getBean("director");
        System.out.println(d.toString());

        Director d2= (Director) factory.getBean("director2");
        System.out.println(d.toString());

        Result r= (Result) factory.getBean("result1");
        System.out.println(r.toString());


        // Scope prototype test
        Notice notice= (Notice) factory.getBean("notice1");
        notice.setId(1);
        notice.setMessage("class will start at 3.00 pm");
        System.out.println(notice);

        Notice notice2= (Notice) factory.getBean("notice1");
        //notice2.setId(2);
        //notice2.setMessage("class is postponed");
        System.out.println(notice2);

        // Scope Singleton Test
        Notice notice3= (Notice) factory.getBean("notice2");
        notice3.setId(1);
        notice3.setMessage("Notice A");
        System.out.println(notice3);

        Notice notice4= (Notice) factory.getBean("notice2");
        notice4.setId(2);
        notice4.setMessage("Notice B");
        System.out.println(notice4);

        Notice notice5= (Notice) factory.getBean("notice2");
        //notice5.setId(3);
        //notice5.setMessage("Notice c");
        System.out.println(notice5);
        // It gives the last modified object stored in singleton cache
        System.out.println(notice3);

        // Initialization callbacks

        Notice notice6= (Notice) factory.getBean("notice3");
        notice6.setId(4);
        notice6.setMessage("Notice D");
        System.out.println(notice6);
        ((ConfigurableBeanFactory) factory).destroySingletons();



    }
}
