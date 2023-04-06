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
        list.addElement(0);
        list.addElement(1);

        list.remove(1);

        Assert.assertEquals(1, list.size());

    }
    @Test
    public void testContains(){
        list.addElement(0);
        list.addElement(1);
        list.addElement(2);

        boolean result = list.ifContains(0);
        Assert.assertTrue(result);

        boolean result1 = list.ifContains(1);
        Assert.assertTrue(result1);

        boolean result3 = list.ifContains(3);
        Assert.assertFalse(result3);

    }
    @Test
    public void testFind(){
        int expected = 1;
        list.addElement(0);
        list.addElement(1);

        int actual = list.find(1);

        Assert.assertEquals(expected, actual);
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
        int expected = 1;
        list.addElement(0);
        list.addElement(1);

        list.getElement(1);

        Assert.assertEquals(expected, list.getElement(1));
    }
    @Test
    public void testCopy(){
        list.addElement(0);
        list.addElement(1);
        list.addElement(2);

        SinglyLinkedList newList = list.copy();
        for (int i = 0; i < list.size(); i++){
          Assert.assertEquals(list, newList);
        }

    }
    @Test
    public void testSort(){
        list.addElement(0);
        list.addElement(1);
        list.addElement(2);

        list.sort();

        Assert.assertEquals(list.getElement(0), 0);
        Assert.assertEquals(list.getElement(1), 1);
        Assert.assertEquals(list.getElement(2), 2);

    }
}
