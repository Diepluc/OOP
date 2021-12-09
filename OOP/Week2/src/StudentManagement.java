public class StudentManagement {
    Student[] students = new Student[100];
    int numberStudent = 0;

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    public void addStudent(Student newStudent) {
        students[numberStudent] = newStudent;
        numberStudent++;
    }

    /**
     * Creat list Group.
     * Count name group
     * Creat string return
     * Save name group
     *
     * @return listStudent
     */
    public String studentsByGroup() {
        String listStudent = "";
        boolean[] check = new boolean[100];
        for (int i = 0; i < numberStudent; i++) {
            if (check[i] == false) {
                check[i] = true;
                listStudent += students[i].getGroup() + '\n';
                for (int j = i; j < numberStudent; j++) {
                    if (sameGroup(students[i], students[j])) {
                        check[j] = true;
                        listStudent += students[j].getInfo() + '\n';
                    }
                }
            }
        }
        return listStudent;
    }

    /**
     * Creat variable save position.
     * Find the student is the same group
     *
     * @param id removesstudent
     */
    public void removeStudent(String id) {
        int locateDel = 0;
        boolean flag = false;
        for (int i = 0; i < numberStudent; i++) {
            if (students[i].getId().equals(id)) {
                locateDel = i;
                flag = true;
                break;
            }
        }
        if (flag) {
            for (int j = locateDel; j < numberStudent - 1; j++) {
                students[j] = students[j + 1];
            }
            numberStudent--;
        }
    }

}
