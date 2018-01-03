package com.bikashgurung;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();

    }
    public boolean addBranch(String branchname){
        if(findBranch(branchname) == null){
            this.branches.add(new Branch(branchname));
            return true;
        }
        return false;
    }
    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }
    public boolean addCustomerTransaction(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if(branch!=null){
            return branch.addCustomerTransaction(customerName, initialAmount);
        }
        return false;
    }
    public Branch findBranch(String branchName){
        for (int i=0; i<this.branches.size();i++){
            Branch checkBranch = this.branches.get(i);
            if(checkBranch.getName().equals(branchName)){
                return checkBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransaction){
        Branch branch = findBranch(branchName);
        if(branch!=null){
            System.out.println("Customer for branch "+branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i=0;i<branchCustomers.size();i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: "+branchCustomer.getName()+"["+(i+1)+"]");
                if(showTransaction){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j=0; j<transactions.size();j++){
                        System.out.println("["+(j+1)+"] Amount "+transactions.get(j));
                    }
                }
            }
            return true;

        }
        else
            return false;
    }

}
