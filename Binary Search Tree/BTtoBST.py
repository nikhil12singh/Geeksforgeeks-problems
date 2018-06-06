#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Mon Jun  4 17:10:16 2018

@author: warrior
"""

class Node:
    
    def __init__(self,data):
        self.data = data
        self.left = None
        self.right = None
        
    def checkSize(root):
        if root is NULL:
            return
        return checkSize(root.left) + 1 + checkSize(root.right)
    
    def storeInorder(arr, root):
        if root is null:
            return
        storeInorder(root.left)
        
        arr.append(root.data)
        
        storeInorder(root.right)
        
    def arrayToBST(arr, root):
        
        if root is None:
            return
        
        arrayToBST(arr,root.left)
        
        root.data = arr[0]
        arr.pop(0)
        
        arrayToBST(arr,root.right)
        
    def binaryTreetoBST(Node root):
        
        if root is None:
            return
        
        size = checkSize(root)
        
        arr = []
        
        storeInorder(arr,root);
        
        arr.sort()
        
        arrayToBST(arr,root)
    
    def main():
    root = Node(10)
    root.left = Node(30)
    root.right = Node(15)
    root.left.right = Node(20)
    root.right.right = Node(5)
        
    binaryTreetoBST(root)
    
if __name__ == "__main__":
    main()
        