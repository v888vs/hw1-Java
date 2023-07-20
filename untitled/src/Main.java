//        You are given two strings word1 and word2.
//        Merge the strings by adding letters
//        in alternating order, starting with word1.
//        If a string is longer than the other,
//        append the additional letters onto
//        the end of the merged string.
//class Solution {
//    public String mergeAlternately(String word1, String word2) {
//        int i = 0;
//        StringBuilder sb = new StringBuilder();
//        while (i < word1.length() || i < word2.length()) {
//            if (i < word1.length()) {
//                sb.append(word1.charAt(i));
//            }
//            if (i < word2.length()) {
//                sb.append(word2.charAt(i));
//            }
//            i += 1;
//        }
//        return sb.toString();
//    }
//}

//        Given an integer array nums and an integer val,
//        remove all occurrences of val in nums in-place.
//        The relative order of the elements may be changed.
//
//        Since it is impossible to change the length of
//        the array in some languages, you must instead
//        have the result be placed in the first part of
//        the array nums. More formally, if there are k elements
//        after removing the duplicates, then the first k
//        elements of nums should hold the final result. I
//        t does not matter what you leave beyond the first k elements.
//class Solution {
//    public int removeElement(int[] nums, int val) {
//        int ind = 0;
//        for ( int i = 0; i < nums.length; i += 1) {
//            if (nums[i] != val) {
//                nums[ind] = nums[i];
//                ind += 1;
//            }
//        }
//        return ind;
//    }
//}

//        You are given two integer arrays nums1 and nums2,
//        sorted in non-decreasing order, and two
//        integers m and n, representing the number of
//        elements in nums1 and nums2 respectively.
//
//        Merge nums1 and nums2 into a single array
//        sorted in non-decreasing order.
//
//        The final sorted array should not be returned by
//        the function, but instead be stored inside the
//        array nums1. To accommodate this, nums1 has a length
//        of m + n, where the first m elements denote the
//        elements that should be merged, and the last n
//        elements are set to 0 and should be ignored.
//        nums2 has a length of n.
//
//class Solution {
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int index = nums1.length - 1;
//        n -= 1;
//        m -= 1;
//        while (n >= 0) {
//            if (m >= 0 && nums1[m] > nums2[n]) {
//                nums1[index] = nums1[m--];
//            }
//            else {
//                nums1[index] = nums2[n--];
//            }
//            index -= 1;
//        }
//    }
//}


//class Solution {
//    public String reverseWords(String s) {
//        StringBuilder sb = new StringBuilder();
//        int end = s.length() - 1;
//        while (end >= 0) {
//            if (s.charAt(end) == ' ') {
//                end -= 1;
//                continue;
//            }
//            int start = end - 1;
//            while (start >= 0 && s.charAt(start) != ' ') {
//                start -= 1;
//            }
//            sb.append(" ");
//            sb.append(s.substring(start + 1, end + 1));
//            end = start - 1;
//        }
//        if (sb.length() > 0) {
//            sb.deleteCharAt(0);
//        }
//        return sb.toString();
//    }
//}


//A phrase is a palindrome if, after converting all uppercase letters into
//        lowercase letters and removing all non-alphanumeric characters,
//        it reads the same forward and backward. Alphanumeric characters
//        include letters and numbers.
//
//        Given a string s, return true if it is a palindrome,
//        or false otherwise.
//class Solution {
//    public boolean isPalindrome(String s) {
//        // задаем два курсор l=идет слева r= идет справа
//        int left = 0;
//        int right = s.length() - 1;
//        while (left < right) {
//            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
//                left += 1;
//            }
//            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
//                right -= 1;
//            }
//            char leftChar = Character.toLowerCase(s.charAt(left));
//            char rightChar = Character.toLowerCase(s.charAt(right));
//            if (leftChar != rightChar) {
//                return false;
//            }
//
//            left += 1;
//            right -= 1;
//        }
//        return true;
//
//    }
//}



