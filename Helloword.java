import javax.swing.JOptionPane;
public class Helloword
{
	public static void main(String[] args)
{
int option=JOptionPane.showConfirmDialog(null,"������Ǵ�����");
if(option==JOptionPane.YES_OPTION)
		System.out.println("����Ҳ��ô����");
else if (option==JOptionPane.NO_OPTION){
			while(option!=JOptionPane.YES_OPTION){
			System.out.println("���ڳ�����,�ٸ���һ�λ��ᣬע�����˵����ʽ�����");
			option=JOptionPane.showConfirmDialog(null,"������һ�飬������Ǵ�����");
			}
		System.out.println("����TM˵����");
		}
else
		System.out.println("���Ҿʹ󷢴ȱ��ĸ����㣬��");
	}
}