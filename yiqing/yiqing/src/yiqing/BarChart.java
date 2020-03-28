package yiqing;//这是引入包名，根据自己创建的包名可以进行修改
import java.awt.Font;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import java.awt.GridLayout;
import javax.swing.JFrame;
public class BarChart {
	ChartPanel frame1;
	public  BarChart(){
		CategoryDataset dataset = getDataSet();//将获得的数据传递给CategoryDataset类的对象
       JFreeChart chart = ChartFactory.createBarChart3D(
      		                 "西北师范大学学生疫情统计表", // 图表标题
                           "统计情况", // 目录轴的显示标签
                           "人数", // 数值轴的显示标签
                           dataset, // 数据集
                           PlotOrientation.VERTICAL, // 图表方向：水平、垂直
                           true, // 是否显示图例(对于简单的柱状图必须是false)
                           false,  // 是否生成工具
                           false  // 是否生成URL链接
                           );
      
       CategoryPlot plot=chart.getCategoryPlot();//获取图表区域对象
       CategoryAxis domainAxis=plot.getDomainAxis();         //水平底部列表
        domainAxis.setLabelFont(new Font("黑体",Font.BOLD,14));         //水平底部标题
        domainAxis.setTickLabelFont(new Font("宋体",Font.BOLD,12));  //垂直标题
        ValueAxis rangeAxis=plot.getRangeAxis();//获取柱状
        rangeAxis.setLabelFont(new Font("黑体",Font.BOLD,15));
         chart.getLegend().setItemFont(new Font("黑体", Font.BOLD, 15));
         chart.getTitle().setFont(new Font("宋体",Font.BOLD,20));//设置标题字体

        frame1=new ChartPanel(chart,true);  //这里也可以用chartFrame,可以直接生成一个独立的Frame
        
	}
	   private static CategoryDataset getDataSet() {
          DefaultCategoryDataset dataset = new DefaultCategoryDataset();
          dataset.addValue(253,"未感染人数","未感染人数");//成绩1
          dataset.addValue(96,"疑似人数","疑似人数");//成绩2
          dataset.addValue(45,"感染人数","感染人数");//成绩3
          return dataset;
	   }
	   public ChartPanel getChartPanel(){
		   return frame1;
	
	   	}
	   public static void main(String args[]){
		   JFrame frame=new JFrame("学生疫情信息表");
		   frame.setLayout(new GridLayout(2,2,10,10));
		   frame.add(new BarChart().getChartPanel());   //添加柱形图
		   frame.setBounds(0, 0, 900, 800);
		   frame.setVisible(true);
	   }
}
