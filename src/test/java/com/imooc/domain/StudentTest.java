package com.imooc.domain;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testMockito() {

        Student mockStudent = mock(Student.class);

        when(mockStudent.getName()).thenReturn("tom").thenReturn("cat");

        mockStudent.setStudId(1);

        Assert.assertTrue(mockStudent instanceof Student);

        Assert.assertEquals(mockStudent.getName(), "tom");
        Assert.assertEquals(mockStudent.getName(), "cat");

        verify(mockStudent, atLeastOnce()).setStudId(1);


    }
}