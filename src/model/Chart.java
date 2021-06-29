/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Locale;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author Isuru Sampath
 */
public class Chart {
     
    CategoryDataset createDataset() {
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    String series1 = "Java";
    String series2 = "PHP";
    String series3 = "C++";
    String series4 = "C#";
 
    dataset.addValue(5.0, series1, "2005");
    dataset.addValue(4.8, series1, "2006");
    dataset.addValue(4.5, series1, "2007");
    dataset.addValue(4.3, series1, "2008");
    dataset.addValue(4.0, series1, "2009");
    dataset.addValue(4.1, series1, "2010");
    dataset.addValue(4.2, series1, "2011");
    dataset.addValue(4.2, series1, "2012");
    dataset.addValue(4.0, series1, "2013");
 
    dataset.addValue(4.0, series2, "2005");
    dataset.addValue(4.2, series2, "2006");
    dataset.addValue(3.8, series2, "2007");
    dataset.addValue(3.6, series2, "2008");
    dataset.addValue(3.4, series2, "2009");
    dataset.addValue(3.4, series2, "2010");
    dataset.addValue(3.3, series2, "2011");
    dataset.addValue(3.1, series2, "2012");
    dataset.addValue(3.2, series2, "2013");
 
    dataset.addValue(3.6, series3, "2005");
    dataset.addValue(3.4, series3, "2006");
    dataset.addValue(3.5, series3, "2007");
    dataset.addValue(3.2, series3, "2008");
    dataset.addValue(3.2, series3, "2009");
    dataset.addValue(3.0, series3, "2010");
    dataset.addValue(2.8, series3, "2011");
    dataset.addValue(2.8, series3, "2012");
    dataset.addValue(2.6, series3, "2013");
 
    dataset.addValue(3.2, series4, "2005");
    dataset.addValue(3.2, series4, "2006");
    dataset.addValue(3.0, series4, "2007");
    dataset.addValue(3.0, series4, "2008");
    dataset.addValue(2.8, series4, "2009");
    dataset.addValue(2.7, series4, "2010");
    dataset.addValue(2.6, series4, "2011");
    dataset.addValue(2.6, series4, "2012");
    dataset.addValue(2.4, series4, "2013");
 
    return dataset;
}

  private static PieDataset createPieDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
//        dataset.addValue(212, "Classes", "JDK 1.0");
//        dataset.addValue(504, "Classes", "JDK 1.1");
//        dataset.addValue(1520, "Classes", "SDK 1.2");
//        dataset.addValue(1842, "Classes", "SDK 1.3");
//        dataset.addValue(2991, "Classes", "SDK 1.4");
//        dataset.addValue(212, "aa", "JDK 1.0");
//        dataset.addValue(504, "aa", "JDK 1.1");
//        dataset.addValue(1520, "aa", "SDK 1.2");
//        dataset.addValue(1842, "aa", "SDK 1.3");
//        dataset.addValue(2991, "aa", "SDK 1.4");
//        
//        dataset.addValue(212, "bb", "JDK 1.0");
//        dataset.addValue(504, "bb", "JDK 1.1");
//        dataset.addValue(1520, "bb", "SDK 1.2");
//        dataset.addValue(1842, "bb", "SDK 1.3");
//        dataset.addValue(2991, "bb", "SDK 1.4");
        dataset.setValue("a", 100);
        dataset.setValue("b", 200);
        dataset.setValue("c", 300);
        dataset.setValue("d", 400);
        dataset.setValue("e", 500);
        dataset.setValue("f", 600);

        return dataset;
    }      
      
      
 public  JPanel createChartPanel() {
    String chartTitle = "Programming Languages Trends";
    String categoryAxisLabel = "Interest over time";
    String valueAxisLabel = "Popularity";
 
    CategoryDataset dataset = createDataset();
 PieDataset pieDataset=createPieDataset();
   JFreeChart chart = ChartFactory.createBarChart3D(chartTitle, categoryAxisLabel, valueAxisLabel, dataset, PlotOrientation.VERTICAL, true, true, true);
// JFreeChart chart =ChartFactory.createPieChart3D(chartTitle, pieDataset, true, true, Locale.ITALY);

 return new ChartPanel(chart);
}
 
}
