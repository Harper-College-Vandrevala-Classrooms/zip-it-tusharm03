package com.csc;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ZipperTest {

    Zipper zipper;

    @BeforeEach
    void setUp() {
        zipper = new Zipper();
    }

    @Test
    void testZipWithEqualLengthLists() {
        List<Integer> nums1 = List.of(1, 3, 5, 7);
        List<Integer> nums2 = List.of(2, 4, 6, 8);
        List<Integer> mergedNumbers = zipper.zip(nums1, nums2);
        assertEquals(List.of(1, 2, 3, 4, 5, 6, 7, 8), mergedNumbers);
    }

    @Test
    void testZipWithFirstListLonger() {
        List<String> colors1 = List.of("Red", "Green", "Blue");
        List<String> colors2 = List.of("White", "Black");
        List<String> mergedColors = zipper.zip(colors1, colors2);
        assertEquals(List.of("Red", "White", "Green", "Black", "Blue"), mergedColors);
    }

    @Test
    void testZipWithSecondListLonger() {
        List<Integer> nums1 = List.of(1, 3);
        List<Integer> nums2 = List.of(2, 4, 6, 8);
        List<Integer> mergedNumbers = zipper.zip(nums1, nums2);
        assertEquals(List.of(1, 2, 3, 4, 6, 8), mergedNumbers);
    }

    @Test
    void testZipWithEmptyFirstList() {
        List<String> colors1 = List.of();
        List<String> colors2 = List.of("White", "Black");
        List<String> mergedColors = zipper.zip(colors1, colors2);
        assertEquals(List.of("White", "Black"), mergedColors);
    }

    @Test
    void testZipWithEmptySecondList() {
        List<String> colors1 = List.of("Red", "Green");
        List<String> colors2 = List.of();
        List<String> mergedColors = zipper.zip(colors1, colors2);
        assertEquals(List.of("Red", "Green"), mergedColors);
    }

    @Test
    void testZipWithBothEmptyLists() {
        List<String> colors1 = List.of();
        List<String> colors2 = List.of();
        List<String> mergedColors = zipper.zip(colors1, colors2);
        assertEquals(List.of(), mergedColors);
    }
}
