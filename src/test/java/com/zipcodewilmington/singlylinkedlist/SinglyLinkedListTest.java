package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    SinglyLinkedList list;
    @Before
    public void BeforeTest(){
        list = new SinglyLinkedList();
    }
    @Test
    public void testAdd(){
        list.addElement(0);

        Assert.assertEquals(1, list.size());
    }
    @Test
    public void testRemove(){

    }
    @Test
    public void testContains(){

    }
    @Test
    public void testFind(){

    }

    @Test
    public void testSize0(){
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void testSize2(){
        list.addElement(0);
        list.addElement(0);

        Assert.assertEquals(2, list.size());
    }

    @Test
    public void testGet(){

    }
    @Test
    public void testCopy(){

    }
    @Test
    public void testSort(){

    }
}
