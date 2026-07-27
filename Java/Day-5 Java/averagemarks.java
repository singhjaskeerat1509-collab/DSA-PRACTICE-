/*To calculate average marks from an array containing marks of physics of all students*/
public class averagemarks {
    public static void main(String[]args){
        int[] physics={75,56,74,72,67,50,69};
        int sum=0;
        for(int i=0;i<physics.length;i++){
            sum=sum+physics[i];
        }
         float average=sum/(float)physics.length;
        System.out.println("The average of all marks in physics is: "+average);
    }
}
