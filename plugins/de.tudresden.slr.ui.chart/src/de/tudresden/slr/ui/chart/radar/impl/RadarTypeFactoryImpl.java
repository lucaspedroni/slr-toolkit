package de.tudresden.slr.ui.chart.radar.impl;

import de.tudresden.slr.ui.chart.radar.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RadarTypeFactoryImpl extends EFactoryImpl implements
		RadarTypeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RadarTypeFactory init() {
		try {
			RadarTypeFactory theRadarTypeFactory = (RadarTypeFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.birt.eclipse.org/RadarChartModelType");
			if (theRadarTypeFactory != null) {
				return theRadarTypeFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RadarTypeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadarTypeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RadarTypePackage.RADAR_SERIES:
			return (EObject) createRadarSeries();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadarSeries createRadarSeries() {
		RadarSeriesImpl radarSeries = new RadarSeriesImpl();
		return radarSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadarTypePackage getRadarTypePackage() {
		return (RadarTypePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RadarTypePackage getPackage() {
		return RadarTypePackage.eINSTANCE;
	}

} //RadarTypeFactoryImpl