class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    // Function to insert a new person into the binary search tree
    void insert(Student data) {
        root = insertRec(root, data);
    }

    Node insertRec(Node root, Student data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data.getName().compareTo(root.data.getName()) < 0) {
            root.left = insertRec(root.left, data);
        } else if (data.getName().compareTo(root.data.getName()) > 0) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    // Function to search for a person by name
    Student searchByName(String name) {
        return searchNameRec(root, name);
    }

    Student searchNameRec(Node root, String name) {
        if (root == null) {
            return null;
        }
        if (root.data.getName().equals(name)) {
            return root.data;
        }
        if (root.data.getName().compareTo(name) > 0) {
            return searchNameRec(root.left, name);
        }
        return searchNameRec(root.right, name);
    }

    // Function to search for a person by age
    Student searchByAge(int age) {
        return searchAgeRec(root, age);
    }

    Student searchAgeRec(Node root, int age) {
        if (root == null) {
            return null;
        }
        if (root.data.getAge() == age) {
            return root.data;
        }
        Student left = searchAgeRec(root.left, age);
        if (left != null) {
            return left;
        }
        Student right = searchAgeRec(root.right, age);
        if (right != null) {
            return right;
        }
        return null;
    }
    
    Student searchByGradeAverage(int gradeAverage) {
        return searchAgeGradeAverage(root, gradeAverage);
    }
    
    Student searchAgeGradeAverage(Node root, int gradeAverage) {
        if (root == null) {
            return null;
        }
        if (root.data.getGradeAverage() == gradeAverage) {
            return root.data;
        }
        Student left = searchAgeGradeAverage(root.left, gradeAverage);
        if (left != null) {
            return left;
        }
        Student right = searchAgeGradeAverage(root.right, gradeAverage);
        if (right != null) {
            return right;
        }
        return null;
    }
}