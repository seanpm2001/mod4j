/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Model Element Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElementCall#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElementCall#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getUIModelElementCall()
 * @model
 * @generated
 */
public interface UIModelElementCall extends UICall {
    /**
     * Returns the value of the '<em><b>Alias</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Alias</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Alias</em>' attribute.
     * @see #setAlias(String)
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getUIModelElementCall_Alias()
     * @model
     * @generated
     */
    String getAlias();

    /**
     * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElementCall#getAlias <em>Alias</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Alias</em>' attribute.
     * @see #getAlias()
     * @generated
     */
    void setAlias(String value);

    /**
     * Returns the value of the '<em><b>Context</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Context</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Context</em>' containment reference.
     * @see #setContext(Expression)
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#getUIModelElementCall_Context()
     * @model containment="true"
     * @generated
     */
    Expression getContext();

    /**
     * Sets the value of the '{@link org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElementCall#getContext <em>Context</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context</em>' containment reference.
     * @see #getContext()
     * @generated
     */
    void setContext(Expression value);

} // UIModelElementCall
