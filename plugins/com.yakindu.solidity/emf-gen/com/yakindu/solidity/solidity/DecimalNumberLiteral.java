/**
 * generated by Xtext 2.18.0
 */
package com.yakindu.solidity.solidity;

import java.math.BigDecimal;

import org.yakindu.base.expressions.expressions.Literal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decimal Number Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.yakindu.solidity.solidity.DecimalNumberLiteral#getValue <em>Value</em>}</li>
 *   <li>{@link com.yakindu.solidity.solidity.DecimalNumberLiteral#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see com.yakindu.solidity.solidity.SolidityPackage#getDecimalNumberLiteral()
 * @model
 * @generated
 */
public interface DecimalNumberLiteral extends Literal {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigDecimal)
	 * @see com.yakindu.solidity.solidity.SolidityPackage#getDecimalNumberLiteral_Value()
	 * @model
	 * @generated
	 */
	BigDecimal getValue();

	/**
	 * Sets the value of the '{@link com.yakindu.solidity.solidity.DecimalNumberLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link com.yakindu.solidity.solidity.Unit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see com.yakindu.solidity.solidity.Unit
	 * @see #setUnit(Unit)
	 * @see com.yakindu.solidity.solidity.SolidityPackage#getDecimalNumberLiteral_Unit()
	 * @model
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link com.yakindu.solidity.solidity.DecimalNumberLiteral#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see com.yakindu.solidity.solidity.Unit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

} // DecimalNumberLiteral
