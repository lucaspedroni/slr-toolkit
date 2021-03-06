package de.tudresden.slr.ui.chart.settings.parts;

import org.eclipse.birt.chart.model.attribute.IntersectionType;
import org.eclipse.birt.chart.model.attribute.TickStyle;

public class AxisSettings {
	
	public AxisSettings() {
	}
	
	public static AxisSettings get() {
		return AXISSETTINGS;
	}

	private static AxisSettings AXISSETTINGS= new AxisSettings();
	//Every Axis
	private int axisFontSize = 16;
	
	//x-Axis
	
	private int xAxisRotation = 45;
	private boolean xAxisAutoRotation = true;
	private boolean xAxisTitleActive = true;
	private String xAxisTitle = "";
	private int xAxisTitleSize = 12;
	private TickStyle xAxisTickStyle = TickStyle.ABOVE_LITERAL;
	private IntersectionType xAxisIntersectionType = IntersectionType.MIN_LITERAL;
	private boolean xAxisTickBetweenCategories = true;
	private double xAxisGapWidth = 0.1;
	//y-Axis
	private boolean yAxisTitleActive = true;
	private String yAxisTitle = "";
	private int yAxisTitleSize = 12;
	private int yAxisScaleStep = 20;
	private boolean yAxisAutoStep = true;

	
	//x-Axis Getter + Setter
	

	public int getxAxisRotation() {
		return xAxisRotation;
	}

	public void setxAxisRotation(int xAxisRotation) {
		this.xAxisRotation = xAxisRotation;
	}
	
	public boolean isxAxisAutoRotation() {
		return xAxisAutoRotation;
	}

	public void setxAxisAutoRotation(boolean xAxisRotationActive) {
		this.xAxisAutoRotation = xAxisRotationActive;
	}

	public boolean isxAxisTitleActive() {
		return xAxisTitleActive;
	}

	public void setxAxisTitleActive(boolean xAxisTitleActive) {
		this.xAxisTitleActive = xAxisTitleActive;
	}

	public int getAxisFontSize() {
		return axisFontSize;
	}

	public void setAxisFontSize(int axisFontSize) {
		this.axisFontSize = axisFontSize;
	}
	
	public String getxAxisTitle() {
		return xAxisTitle;
	}

	public void setxAxisTitle(String xAxisTitle) {
		this.xAxisTitle = xAxisTitle;
	}

	public int getxAxisTitleSize() {
		return xAxisTitleSize;
	}

	public void setxAxisTitleSize(int xAxisTitleSize) {
		this.xAxisTitleSize = xAxisTitleSize;
	}

	public TickStyle getxAxisTickStyle() {
		return xAxisTickStyle;
	}

	public void setxAxisTickStyle(TickStyle xAxisTickStyle) {
		this.xAxisTickStyle = xAxisTickStyle;
	}

	public IntersectionType getxAxisIntersectionType() {
		return xAxisIntersectionType;
	}

	public void setxAxisIntersectionType(IntersectionType xAxisIntersectionStyle) {
		this.xAxisIntersectionType = xAxisIntersectionStyle;
	}

	public boolean isxAxisTickBetweenCategories() {
		return xAxisTickBetweenCategories;
	}

	public void setxAxisTickBetweenCategories(boolean xAxisTickBetweenCategories) {
		this.xAxisTickBetweenCategories = xAxisTickBetweenCategories;
	}
	
	public double getxAxisGapWidth() {
		return xAxisGapWidth;
	}

	public void setxAxisGapWidth(double xAxisGapWidth) {
		this.xAxisGapWidth = xAxisGapWidth;
	}

	//y-Axis Getter + Setter
	public boolean isyAxisTitleActive() {
		return yAxisTitleActive;
	}

	public void setyAxisTitleActive(boolean yAxisTitleActive) {
		this.yAxisTitleActive = yAxisTitleActive;
	}

	public String getyAxisTitle() {
		return yAxisTitle;
	}

	public void setyAxisTitle(String yAxisTitle) {
		this.yAxisTitle = yAxisTitle;
	}

	public int getyAxisTitleSize() {
		return yAxisTitleSize;
	}

	public void setyAxisTitleSize(int yAxisTitleSize) {
		this.yAxisTitleSize = yAxisTitleSize;
	}

	public int getyAxisScaleStep() {
		return yAxisScaleStep;
	}

	public void setyAxisScaleStep(int yAxisScaleStep) {
		this.yAxisScaleStep = yAxisScaleStep;
	}

	public boolean isyAxisAutoStep() {
		return yAxisAutoStep;
	}

	public void setyAxisAutoStep(boolean yAxisStepActive) {
		this.yAxisAutoStep = yAxisStepActive;
	}
	

}
