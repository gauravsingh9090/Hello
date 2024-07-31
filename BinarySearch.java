#include <iostream>
using namespace std;

class Node {
public:
    int key;
    Node* left;
    Node* right;

    Node(int item) {
        key = item;
        left = right = nullptr;
    }
};

class BinaryTree {
public:
    Node* root;

    BinaryTree() {
        root = nullptr;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node* insertRec(Node* root, int key) {
        if (root == nullptr) {
            root = new Node(key);
            return root;
        }

        if (key < root->key)
            root->left = insertRec(root->left, key);
        else if (key > root->key)
            root->right = insertRec(root->right, key);

        return root;
    }

    void inOrder() {
        inOrderRec(root);
    }

    void inOrderRec(Node* root) {
        if (root != nullptr) {
            inOrderRec(root->left);
            cout << root->key << " ";
            inOrderRec(root->right);
        }
    }

    void preOrder() {
        preOrderRec(root);
    }

    void preOrderRec(Node* root) {
        if (root != nullptr) {
            cout << root->key << " ";
            preOrderRec(root->left);
            preOrderRec(root->right);
        }
    }

    void postOrder() {
        postOrderRec(root);
    }

    void postOrderRec(Node* root) {
        if (root != nullptr) {
            postOrderRec(root->left);
            postOrderRec(root->right);
            cout << root->key << " ";
        }
    }

    Node* search(Node* root, int key) {
        if (root == nullptr || root->key == key)
            return root;

        if (root->key > key)
            return search(root->left, key);

        return search(root->right, key);
    }
};

int main() {
    BinaryTree tree;

    tree.insert(50);
    tree.insert(30);
    tree.insert(20);
    tree.insert(40);
    tree.insert(70);
    tree.insert(60);
    tree.insert(80);

    cout << "In-order traversal:\n";
    tree.inOrder();

    cout << "\nPre-order traversal:\n";
    tree.preOrder();

    cout << "\nPost-order traversal:\n";
    tree.postOrder();

    cout << "\nSearch for 40:\n";
    Node* result = tree.search(tree.root, 40);
    if (result != nullptr) {
        cout << "Found node with key: " << result->key << endl;
    } else {
        cout << "Node not found" << endl;
    }

    return 0;
}
