package ZJIQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorVsComparable {
//while sorting List of integer can be sorted but list of obj cannot(on what basis/field u want to sort.)
//comparator used for multiple sorting logics and comparable used for single logic.
    public static void main(String[] args) {
        Comparator<EmployeeComparableVsComparator> com = new Comparator<EmployeeComparableVsComparator>() {

            @Override
            public int compare(EmployeeComparableVsComparator o1, EmployeeComparableVsComparator o2) {
                if (o1.getId()>o2.getId()) {
                    return 1;
                }
                return -1;
            }
            
        };

        ArrayList<EmployeeComparableVsComparator> obj = new ArrayList<>();
        obj.add(new EmployeeComparableVsComparator(1, "Abcd", "IT", "Chd"));
        obj.add(new EmployeeComparableVsComparator(4, "Efgh", "HR", "Moh"));
        obj.add(new EmployeeComparableVsComparator(3, "Ijkl", "QA", "Mum"));
        obj.add(new EmployeeComparableVsComparator(2, "Mnop", "IT", "Noi"));

        Collections.sort(obj, com);
        for (EmployeeComparableVsComparator employeeComparableVsComparator : obj) {
            System.out.println(employeeComparableVsComparator);
        }

    }
}
