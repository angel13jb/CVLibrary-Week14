package uk.co.library.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "dataset")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Tester", "Harrow", "up to 5 miles", "30000", "50000", "Per annum", "Permanent", "Permanent Tester jobs in Harrow on the Hill"},
                {"Tester", "Leicestershire", "up to 10 miles", "30000", "50000", "Per annum", "Permanent", "Permanent Tester jobs in Leicestershire"},
                {"Tester", "Sheffield", "up to 5 miles", "25000", "40000", "Per annum", "Permanent", "Permanent Tester jobs in Sheffield"},
                {"Tester", "Derbyshire", "up to 10 miles", "30000", "45000", "Per annum", "Permanent", "Permanent Tester jobs in Derbyshire"},
                {"Tester", "Nottinghamshire", "up to 5 miles", "30000", "50000", "Per annum", "Permanent", "Permanent Tester jobs in Nottinghamshire"},
                {"Tester", "Manchester", "up to 7 miles", "30000", "40000", "Per annum", "Permanent", "Permanent Tester jobs in Manchester"}
        };


        return data;

    }
}