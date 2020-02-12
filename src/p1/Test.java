package p1;

import org.springframework.beans.factory.BeanFactory;
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
    }
}
