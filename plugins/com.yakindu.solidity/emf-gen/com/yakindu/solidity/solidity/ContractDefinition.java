/**
 * generated by Xtext 2.18.0
 */
package com.yakindu.solidity.solidity;

import org.eclipse.emf.common.util.EList;

import org.yakindu.base.types.ComplexType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.yakindu.solidity.solidity.ContractDefinition#getType <em>Type</em>}</li>
 *   <li>{@link com.yakindu.solidity.solidity.ContractDefinition#getArgumentList <em>Argument List</em>}</li>
 * </ul>
 *
 * @see com.yakindu.solidity.solidity.SolidityPackage#getContractDefinition()
 * @model
 * @generated
 */
public interface ContractDefinition extends ComplexType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.yakindu.solidity.solidity.ContractType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.yakindu.solidity.solidity.ContractType
	 * @see #setType(ContractType)
	 * @see com.yakindu.solidity.solidity.SolidityPackage#getContractDefinition_Type()
	 * @model
	 * @generated
	 */
	ContractType getType();

	/**
	 * Sets the value of the '{@link com.yakindu.solidity.solidity.ContractDefinition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.yakindu.solidity.solidity.ContractType
	 * @see #getType()
	 * @generated
	 */
	void setType(ContractType value);

	/**
	 * Returns the value of the '<em><b>Argument List</b></em>' containment reference list.
	 * The list contents are of type {@link com.yakindu.solidity.solidity.SuperTypeArgumentList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument List</em>' containment reference list.
	 * @see com.yakindu.solidity.solidity.SolidityPackage#getContractDefinition_ArgumentList()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuperTypeArgumentList> getArgumentList();

} // ContractDefinition
