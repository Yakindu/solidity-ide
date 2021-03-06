/**
 * generated by Xtext 2.18.0
 */
package com.yakindu.solidity.solidity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly For Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.yakindu.solidity.solidity.AssemblyForExpression#getPrestatementblock <em>Prestatementblock</em>}</li>
 *   <li>{@link com.yakindu.solidity.solidity.AssemblyForExpression#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.yakindu.solidity.solidity.AssemblyForExpression#getLoopstatementblock <em>Loopstatementblock</em>}</li>
 *   <li>{@link com.yakindu.solidity.solidity.AssemblyForExpression#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see com.yakindu.solidity.solidity.SolidityPackage#getAssemblyForExpression()
 * @model
 * @generated
 */
public interface AssemblyForExpression extends AssemblyExpression {
	/**
	 * Returns the value of the '<em><b>Prestatementblock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prestatementblock</em>' containment reference.
	 * @see #setPrestatementblock(InlineAssemblyBlock)
	 * @see com.yakindu.solidity.solidity.SolidityPackage#getAssemblyForExpression_Prestatementblock()
	 * @model containment="true"
	 * @generated
	 */
	InlineAssemblyBlock getPrestatementblock();

	/**
	 * Sets the value of the '{@link com.yakindu.solidity.solidity.AssemblyForExpression#getPrestatementblock <em>Prestatementblock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prestatementblock</em>' containment reference.
	 * @see #getPrestatementblock()
	 * @generated
	 */
	void setPrestatementblock(InlineAssemblyBlock value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(FunctionalAssemblyExpression)
	 * @see com.yakindu.solidity.solidity.SolidityPackage#getAssemblyForExpression_Condition()
	 * @model containment="true"
	 * @generated
	 */
	FunctionalAssemblyExpression getCondition();

	/**
	 * Sets the value of the '{@link com.yakindu.solidity.solidity.AssemblyForExpression#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(FunctionalAssemblyExpression value);

	/**
	 * Returns the value of the '<em><b>Loopstatementblock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loopstatementblock</em>' containment reference.
	 * @see #setLoopstatementblock(InlineAssemblyBlock)
	 * @see com.yakindu.solidity.solidity.SolidityPackage#getAssemblyForExpression_Loopstatementblock()
	 * @model containment="true"
	 * @generated
	 */
	InlineAssemblyBlock getLoopstatementblock();

	/**
	 * Sets the value of the '{@link com.yakindu.solidity.solidity.AssemblyForExpression#getLoopstatementblock <em>Loopstatementblock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loopstatementblock</em>' containment reference.
	 * @see #getLoopstatementblock()
	 * @generated
	 */
	void setLoopstatementblock(InlineAssemblyBlock value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(InlineAssemblyBlock)
	 * @see com.yakindu.solidity.solidity.SolidityPackage#getAssemblyForExpression_Body()
	 * @model containment="true"
	 * @generated
	 */
	InlineAssemblyBlock getBody();

	/**
	 * Sets the value of the '{@link com.yakindu.solidity.solidity.AssemblyForExpression#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(InlineAssemblyBlock value);

} // AssemblyForExpression
