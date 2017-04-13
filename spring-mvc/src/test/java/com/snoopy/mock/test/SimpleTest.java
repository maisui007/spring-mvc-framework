package com.snoopy.mock.test;
import junit.framework.Assert;
import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.*;
/**
 * Created by hnair20160706 on 2017/4/12.
 */
public class SimpleTest {

    @Test
    public void simpleTest(){
        /**创建mock对象不能对final,Anonymous,primitive类进行mock**/
        /**创建mock对象，参数可以是类，也可以是接口**/
        List<String> stringList = mock(List.class);
        when(stringList.get(0)).thenReturn("hello world!");
        String result = stringList.get(0);

        /**验证方法调用(是否调用了get(0))**/
        verify(stringList).get(0);

        /**junit测试**/
        Assert.assertEquals("hello world",result);
    }



    @Test
    public void simpleTestThrowExecption(){
        /**创建mock对象不能对final,Anonymous,primitive类进行mock**/
        /**创建mock对象，参数可以是类，也可以是接口**/
        List<String> stringList = mock(List.class);
//        when(stringList.get(0)).thenReturn("hello world");
        when(stringList.get(1)).thenThrow(new RuntimeException("test execption"));
//        String result = stringList.get(0);

        /**验证方法调用(是否调用了get(0))**/
//        verify(stringList).get(0);
        verify(stringList).get(1);

        /**junit测试**/
//        Assert.assertEquals("hello world",result);
    }
}
