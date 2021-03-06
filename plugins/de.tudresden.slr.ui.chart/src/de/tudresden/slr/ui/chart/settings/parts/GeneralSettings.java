package de.tudresden.slr.ui.chart.settings.parts;

import org.eclipse.swt.graphics.RGB;

public class GeneralSettings {
	
	public GeneralSettings() {
	}
	
	public static GeneralSettings get() {
		return GRAPHSETTINGS;
	}

	private static GeneralSettings GRAPHSETTINGS= new GeneralSettings();
	
	private double chartBubbleScaling = 0.5;

	private String chartType = "Bar Chart";
	private String chartSubType = "Side-By-Side";
	private String chartTitle = "";
	//TitleFont
	private int chartTitleSize = 16;
	private RGB chartTitleColor = new RGB(0,0,0);
	private boolean chartTitleItalic = false;
	private boolean chartTitleBold = false;
	private boolean chartTitleUnderline = false;
	
	private boolean chartShowLabels = true;
	private int chartShowLabel = 10;
	//Graphvariables Getter + Setter
	public String getChartType() {
		return chartType;
	}

	public void setChartType(String chartType) {
		this.chartType = chartType;
	}

	public String getChartSubType() {
		return chartSubType;
	}

	public void setChartSubType(String chartSubType) {
		this.chartSubType = chartSubType;
	}
	//Titlevariables Getter + Setter
	public String getChartTitle() {
		return chartTitle;
	}

	public void setChartTitle(String chartTitle) {
		this.chartTitle = chartTitle;
	}

	public int getChartTitleSize() {
		return chartTitleSize;
	}

	public void setChartTitleSize(int chartTitleSize) {
		this.chartTitleSize = chartTitleSize;
	}

	public RGB getChartTitleColor() {
		return chartTitleColor;
	}

	public void setChartTitleColor(RGB chartTitleColor) {
		this.chartTitleColor = chartTitleColor;
	}

	public boolean isChartTitleItalic() {
		return chartTitleItalic;
	}

	public void setChartTitleItalic(boolean chartTitleItalic) {
		this.chartTitleItalic = chartTitleItalic;
	}

	public boolean isChartTitleBold() {
		return chartTitleBold;
	}

	public void setChartTitleBold(boolean chartTitleBold) {
		this.chartTitleBold = chartTitleBold;
	}

	public boolean isChartTitleUnderline() {
		return chartTitleUnderline;
	}

	public void setChartTitleUnderline(boolean chartTitleUnderline) {
		this.chartTitleUnderline = chartTitleUnderline;
	}

	public boolean isChartShowLabels() {
		return chartShowLabels;
	}

	public void setChartShowLabels(boolean chartShowLabels) {
		this.chartShowLabels = chartShowLabels;
	}

	public int getChartShowLabel() {
		return chartShowLabel;
	}

	public void setChartShowLabel(int chartShowLabel) {
		this.chartShowLabel = chartShowLabel;
	}
	public double getChartBubbleScaling() {
		return chartBubbleScaling;
	}

	public void setChartBubbleScaling(double chartBubbleScaling) {
		this.chartBubbleScaling = chartBubbleScaling;
	}
	
}
