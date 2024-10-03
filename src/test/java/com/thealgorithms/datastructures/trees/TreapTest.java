package com.thealgorithms.datastructures.trees;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TreapTest {

    @Test
    void build() {
        Treap treap = new Treap();
        treap.insert(4);
        treap.insert(5);
        treap.insert(9);
        treap.insert(2);
        assertEquals("{2,4,5,9,}", treap.inOrder());
    }

    @Test
    void delete() {
        Treap treap = new Treap();
        treap.insert(5);
        treap.insert(9);
        treap.insert(6);
        treap.insert(2);
        treap.insert(3);
        treap.insert(8);
        treap.insert(1);
        treap.delete(5);
        assertEquals("{1,2,3,6,8,9,}", treap.inOrder());
    }

    @Test
    void searchAndFound() {
        Treap treap = new Treap();
        treap.insert(5);
        treap.insert(9);
        treap.insert(6);
        treap.insert(2);
        treap.insert(3);
        treap.insert(8);
        treap.insert(1);
        assertEquals(5, treap.search(5).value());
    }

    @Test
    void searchAndNotFound() {
        Treap treap = new Treap();
        treap.insert(5);
        treap.insert(9);
        treap.insert(6);
        treap.insert(2);
        treap.insert(3);
        treap.insert(8);
        treap.insert(1);
        assertEquals(null, treap.search(4));
    }

    @Test
    void lowerBound() {
        Treap treap = new Treap();
        treap.insert(5);
        treap.insert(9);
        treap.insert(6);
        treap.insert(2);
        treap.insert(3);
        treap.insert(8);
        treap.insert(1);
        assertEquals(5, treap.lowerBound(4));
    }

    @Test
    void upperBound() {
        Treap treap = new Treap();
        treap.insert(5);
        treap.insert(9);
        treap.insert(6);
        treap.insert(2);
        treap.insert(3);
        treap.insert(8);
        treap.insert(1);
        assertEquals(6, treap.upperBound(5));
    }

    @Test
    void misc() {
        Treap treap = new Treap();
        treap.insert(5);
        treap.insert(9);
        treap.insert(6);
        treap.insert(2);
        treap.insert(3);
        treap.insert(8);
        treap.insert(1);
        assertEquals(7, treap.size());
        assertEquals(false, treap.isEmpty());
    }
}