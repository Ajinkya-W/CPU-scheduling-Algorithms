/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Deepak
 */
public class Process {
        //AT arrival time BT burst time RT remaining time
        //WT waiting time TAT total turn around time
        //flag = false ; process not completed
        public int AT,BT,WT,TAT,RT,Pr,ST,id,ReST1,ReST2,vruntime,startTime,execTime;
        public boolean flag;
        public RedBlackTree rbt;
        public Process(){
            AT=0;TAT=0;Pr=0;ST=0;ReST1=0;ReST2=0;
            flag=false;
        }
        //Copy constructor
        public Process(Process cp){
            
            this.AT=cp.AT;this.TAT=cp.TAT;
            this.BT=cp.BT;this.flag=cp.flag;
            this.Pr=cp.Pr;this.ReST1=cp.ReST1;
            this.WT=cp.WT;this.ReST2=cp.ReST2;
            this.RT=cp.RT;this.ST=cp.ST;
        }
        public Process(int newId,int newArrivalTime, int newExecTime){

            ST=0;
            TAT=0;

            id=newId;
            execTime=newExecTime;
            AT=newArrivalTime;
            //WT=AT;
            vruntime=AT;
        }
        
        public Process(RedBlackTree rbtree,int newId,int newArrivalTime, int newExecTime){
		
		ST=0;
		
		id=newId;
		execTime=newExecTime;
		AT=newArrivalTime;
		//WT=AT;
		vruntime=0;
		
		rbt=rbtree;
		rbt.insert(this);	
	}
        
    }
    

