import javax.swing.JOptionPane;
public class Helloword
{
	public static void main(String[] args)
{
int option=JOptionPane.showConfirmDialog(null,"是大佬吗");
if(option==JOptionPane.YES_OPTION)
		System.out.println("嗯我也这么觉得");
else if (option==JOptionPane.NO_OPTION){
			while(option!=JOptionPane.YES_OPTION){
			System.out.println("你在扯犊子,再给你一次机会，注意你的说话方式和身份");
			option=JOptionPane.showConfirmDialog(null,"再问你一遍，熊子璇是大佬吗");
			}
		System.out.println("终于TM说对了");
		}
else
		System.out.println("那我就大发慈悲的告诉你，是");
	}
}
