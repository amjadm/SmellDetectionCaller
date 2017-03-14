/*******************************************************************************
 * Copyright (c) 2014 Yann-GaÃƒÂ«l GuÃƒÂ©hÃƒÂ©neuc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     Yann-GaÃƒÂ«l GuÃƒÂ©hÃƒÂ©neuc and others, see in file; API and its implementation
 ******************************************************************************/
//
// Generated by JTB 1.2.2
//

package util.parser.java.v14.visitors;
import util.parser.java.v14.nodes.*;

/**
 * All void visitors must implement this interface.
 */
public interface Visitor {
   //
   // void Auto class visitors
   //
   public void visit(NodeList n);
   public void visit(NodeListOptional n);
   public void visit(NodeOptional n);
   public void visit(NodeSequence n);
   public void visit(NodeToken n);

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> [ PackageDeclaration() ]
    * f1 -> ( ImportDeclaration() )*
    * f2 -> ( TypeDeclaration() )*
    * f3 -> <EOF>
    */
   public void visit(CompilationUnit n);

   /**
    * f0 -> "package"
    * f1 -> Name()
    * f2 -> ";"
    */
   public void visit(PackageDeclaration n);

   /**
    * f0 -> "import"
    * f1 -> Name()
    * f2 -> [ "." "*" ]
    * f3 -> ";"
    */
   public void visit(ImportDeclaration n);

   /**
    * f0 -> ClassDeclaration()
    *       | InterfaceDeclaration()
    *       | ";"
    */
   public void visit(TypeDeclaration n);

   /**
    * f0 -> ( "abstract" | "final" | "public" | "strictfp" )*
    * f1 -> UnmodifiedClassDeclaration()
    */
   public void visit(ClassDeclaration n);

   /**
    * f0 -> "class"
    * f1 -> <IDENTIFIER>
    * f2 -> [ "extends" Name() ]
    * f3 -> [ "implements" NameList() ]
    * f4 -> ClassBody()
    */
   public void visit(UnmodifiedClassDeclaration n);

   /**
    * f0 -> "{"
    * f1 -> ( ClassBodyDeclaration() )*
    * f2 -> "}"
    */
   public void visit(ClassBody n);

   /**
    * f0 -> ( "static" | "abstract" | "final" | "public" | "protected" | "private" | "strictfp" )*
    * f1 -> UnmodifiedClassDeclaration()
    */
   public void visit(NestedClassDeclaration n);

   /**
    * f0 -> Initializer()
    *       | NestedClassDeclaration()
    *       | NestedInterfaceDeclaration()
    *       | ConstructorDeclaration()
    *       | MethodDeclaration()
    *       | FieldDeclaration()
    */
   public void visit(ClassBodyDeclaration n);

   /**
    * f0 -> ( "public" | "protected" | "private" | "static" | "abstract" | "final" | "native" | "synchronized" | "strictfp" )*
    * f1 -> ResultType()
    * f2 -> <IDENTIFIER>
    * f3 -> "("
    */
   public void visit(MethodDeclarationLookahead n);

   /**
    * f0 -> ( "abstract" | "public" | "strictfp" )*
    * f1 -> UnmodifiedInterfaceDeclaration()
    */
   public void visit(InterfaceDeclaration n);

   /**
    * f0 -> ( "static" | "abstract" | "final" | "public" | "protected" | "private" | "strictfp" )*
    * f1 -> UnmodifiedInterfaceDeclaration()
    */
   public void visit(NestedInterfaceDeclaration n);

   /**
    * f0 -> "interface"
    * f1 -> <IDENTIFIER>
    * f2 -> [ "extends" NameList() ]
    * f3 -> "{"
    * f4 -> ( InterfaceMemberDeclaration() )*
    * f5 -> "}"
    */
   public void visit(UnmodifiedInterfaceDeclaration n);

   /**
    * f0 -> NestedClassDeclaration()
    *       | NestedInterfaceDeclaration()
    *       | MethodDeclaration()
    *       | FieldDeclaration()
    */
   public void visit(InterfaceMemberDeclaration n);

   /**
    * f0 -> ( "public" | "protected" | "private" | "static" | "final" | "transient" | "volatile" )*
    * f1 -> Type()
    * f2 -> VariableDeclarator()
    * f3 -> ( "," VariableDeclarator() )*
    * f4 -> ";"
    */
   public void visit(FieldDeclaration n);

   /**
    * f0 -> VariableDeclaratorId()
    * f1 -> [ "=" VariableInitializer() ]
    */
   public void visit(VariableDeclarator n);

   /**
    * f0 -> <IDENTIFIER>
    * f1 -> ( "[" "]" )*
    */
   public void visit(VariableDeclaratorId n);

   /**
    * f0 -> ArrayInitializer()
    *       | Expression()
    */
   public void visit(VariableInitializer n);

   /**
    * f0 -> "{"
    * f1 -> [ VariableInitializer() ( "," VariableInitializer() )* ]
    * f2 -> [ "," ]
    * f3 -> "}"
    */
   public void visit(ArrayInitializer n);

   /**
    * f0 -> ( "public" | "protected" | "private" | "static" | "abstract" | "final" | "native" | "synchronized" | "strictfp" )*
    * f1 -> ResultType()
    * f2 -> MethodDeclarator()
    * f3 -> [ "throws" NameList() ]
    * f4 -> ( Block() | ";" )
    */
   public void visit(MethodDeclaration n);

   /**
    * f0 -> <IDENTIFIER>
    * f1 -> FormalParameters()
    * f2 -> ( "[" "]" )*
    */
   public void visit(MethodDeclarator n);

   /**
    * f0 -> "("
    * f1 -> [ FormalParameter() ( "," FormalParameter() )* ]
    * f2 -> ")"
    */
   public void visit(FormalParameters n);

   /**
    * f0 -> [ "final" ]
    * f1 -> Type()
    * f2 -> VariableDeclaratorId()
    */
   public void visit(FormalParameter n);

   /**
    * f0 -> [ "public" | "protected" | "private" ]
    * f1 -> <IDENTIFIER>
    * f2 -> FormalParameters()
    * f3 -> [ "throws" NameList() ]
    * f4 -> "{"
    * f5 -> [ ExplicitConstructorInvocation() ]
    * f6 -> ( BlockStatement() )*
    * f7 -> "}"
    */
   public void visit(ConstructorDeclaration n);

   /**
    * f0 -> "this" Arguments() ";"
    *       | [ PrimaryExpression() "." ] "super" Arguments() ";"
    */
   public void visit(ExplicitConstructorInvocation n);

   /**
    * f0 -> [ "static" ]
    * f1 -> Block()
    */
   public void visit(Initializer n);

   /**
    * f0 -> ( PrimitiveType() | Name() )
    * f1 -> ( "[" "]" )*
    */
   public void visit(Type n);

   /**
    * f0 -> "boolean"
    *       | "char"
    *       | "byte"
    *       | "short"
    *       | "int"
    *       | "long"
    *       | "float"
    *       | "double"
    */
   public void visit(PrimitiveType n);

   /**
    * f0 -> "void"
    *       | Type()
    */
   public void visit(ResultType n);

   /**
    * f0 -> <IDENTIFIER>
    * f1 -> ( "." <IDENTIFIER> )*
    */
   public void visit(Name n);

   /**
    * f0 -> Name()
    * f1 -> ( "," Name() )*
    */
   public void visit(NameList n);

   /**
    * f0 -> ConditionalExpression()
    * f1 -> [ AssignmentOperator() Expression() ]
    */
   public void visit(Expression n);

   /**
    * f0 -> "="
    *       | "*="
    *       | "/="
    *       | "%="
    *       | "+="
    *       | "-="
    *       | "<<="
    *       | ">>="
    *       | ">>>="
    *       | "&="
    *       | "^="
    *       | "|="
    */
   public void visit(AssignmentOperator n);

   /**
    * f0 -> ConditionalOrExpression()
    * f1 -> [ "?" Expression() ":" ConditionalExpression() ]
    */
   public void visit(ConditionalExpression n);

   /**
    * f0 -> ConditionalAndExpression()
    * f1 -> ( "||" ConditionalAndExpression() )*
    */
   public void visit(ConditionalOrExpression n);

   /**
    * f0 -> InclusiveOrExpression()
    * f1 -> ( "&&" InclusiveOrExpression() )*
    */
   public void visit(ConditionalAndExpression n);

   /**
    * f0 -> ExclusiveOrExpression()
    * f1 -> ( "|" ExclusiveOrExpression() )*
    */
   public void visit(InclusiveOrExpression n);

   /**
    * f0 -> AndExpression()
    * f1 -> ( "^" AndExpression() )*
    */
   public void visit(ExclusiveOrExpression n);

   /**
    * f0 -> EqualityExpression()
    * f1 -> ( "&" EqualityExpression() )*
    */
   public void visit(AndExpression n);

   /**
    * f0 -> InstanceOfExpression()
    * f1 -> ( ( "==" | "!=" ) InstanceOfExpression() )*
    */
   public void visit(EqualityExpression n);

   /**
    * f0 -> RelationalExpression()
    * f1 -> [ "instanceof" Type() ]
    */
   public void visit(InstanceOfExpression n);

   /**
    * f0 -> ShiftExpression()
    * f1 -> ( ( "<" | ">" | "<=" | ">=" ) ShiftExpression() )*
    */
   public void visit(RelationalExpression n);

   /**
    * f0 -> AdditiveExpression()
    * f1 -> ( ( "<<" | ">>" | ">>>" ) AdditiveExpression() )*
    */
   public void visit(ShiftExpression n);

   /**
    * f0 -> MultiplicativeExpression()
    * f1 -> ( ( "+" | "-" ) MultiplicativeExpression() )*
    */
   public void visit(AdditiveExpression n);

   /**
    * f0 -> UnaryExpression()
    * f1 -> ( ( "*" | "/" | "%" ) UnaryExpression() )*
    */
   public void visit(MultiplicativeExpression n);

   /**
    * f0 -> ( "+" | "-" ) UnaryExpression()
    *       | PreIncrementExpression()
    *       | PreDecrementExpression()
    *       | UnaryExpressionNotPlusMinus()
    */
   public void visit(UnaryExpression n);

   /**
    * f0 -> "++"
    * f1 -> PrimaryExpression()
    */
   public void visit(PreIncrementExpression n);

   /**
    * f0 -> "--"
    * f1 -> PrimaryExpression()
    */
   public void visit(PreDecrementExpression n);

   /**
    * f0 -> ( "~" | "!" ) UnaryExpression()
    *       | CastExpression()
    *       | PostfixExpression()
    */
   public void visit(UnaryExpressionNotPlusMinus n);

   /**
    * f0 -> "(" PrimitiveType()
    *       | "(" Name() "[" "]"
    *       | "(" Name() ")" ( "~" | "!" | "(" | <IDENTIFIER> | "this" | "super" | "new" | Literal() )
    */
   public void visit(CastLookahead n);

   /**
    * f0 -> PrimaryExpression()
    * f1 -> [ "++" | "--" ]
    */
   public void visit(PostfixExpression n);

   /**
    * f0 -> "(" Type() ")" UnaryExpression()
    *       | "(" Type() ")" UnaryExpressionNotPlusMinus()
    */
   public void visit(CastExpression n);

   /**
    * f0 -> PrimaryPrefix()
    * f1 -> ( PrimarySuffix() )*
    */
   public void visit(PrimaryExpression n);

   /**
    * f0 -> Literal()
    *       | "this"
    *       | "super" "." <IDENTIFIER>
    *       | "(" Expression() ")"
    *       | AllocationExpression()
    *       | ResultType() "." "class"
    *       | Name()
    */
   public void visit(PrimaryPrefix n);

   /**
    * f0 -> "." "this"
    *       | "." AllocationExpression()
    *       | "[" Expression() "]"
    *       | "." <IDENTIFIER>
    *       | Arguments()
    */
   public void visit(PrimarySuffix n);

   /**
    * f0 -> <INTEGER_LITERAL>
    *       | <FLOATING_POINT_LITERAL>
    *       | <CHARACTER_LITERAL>
    *       | <STRING_LITERAL>
    *       | BooleanLiteral()
    *       | NullLiteral()
    */
   public void visit(Literal n);

   /**
    * f0 -> "true"
    *       | "false"
    */
   public void visit(BooleanLiteral n);

   /**
    * f0 -> "null"
    */
   public void visit(NullLiteral n);

   /**
    * f0 -> "("
    * f1 -> [ ArgumentList() ]
    * f2 -> ")"
    */
   public void visit(Arguments n);

   /**
    * f0 -> Expression()
    * f1 -> ( "," Expression() )*
    */
   public void visit(ArgumentList n);

   /**
    * f0 -> "new" PrimitiveType() ArrayDimsAndInits()
    *       | "new" Name() ( ArrayDimsAndInits() | Arguments() [ ClassBody() ] )
    */
   public void visit(AllocationExpression n);

   /**
    * f0 -> ( "[" Expression() "]" )+ ( "[" "]" )*
    *       | ( "[" "]" )+ ArrayInitializer()
    */
   public void visit(ArrayDimsAndInits n);

   /**
    * f0 -> LabeledStatement()
    *       | Block()
    *       | EmptyStatement()
    *       | StatementExpression() ";"
    *       | SwitchStatement()
    *       | IfStatement()
    *       | WhileStatement()
    *       | DoStatement()
    *       | ForStatement()
    *       | BreakStatement()
    *       | ContinueStatement()
    *       | ReturnStatement()
    *       | ThrowStatement()
    *       | SynchronizedStatement()
    *       | TryStatement()
    *       | AssertStatement()
    */
   public void visit(Statement n);

   /**
    * f0 -> <IDENTIFIER>
    * f1 -> ":"
    * f2 -> Statement()
    */
   public void visit(LabeledStatement n);

   /**
    * f0 -> "{"
    * f1 -> ( BlockStatement() )*
    * f2 -> "}"
    */
   public void visit(Block n);

   /**
    * f0 -> LocalVariableDeclaration() ";"
    *       | Statement()
    *       | UnmodifiedClassDeclaration()
    *       | UnmodifiedInterfaceDeclaration()
    */
   public void visit(BlockStatement n);

   /**
    * f0 -> [ "final" ]
    * f1 -> Type()
    * f2 -> VariableDeclarator()
    * f3 -> ( "," VariableDeclarator() )*
    */
   public void visit(LocalVariableDeclaration n);

   /**
    * f0 -> ";"
    */
   public void visit(EmptyStatement n);

   /**
    * f0 -> PreIncrementExpression()
    *       | PreDecrementExpression()
    *       | PrimaryExpression() [ "++" | "--" | AssignmentOperator() Expression() ]
    */
   public void visit(StatementExpression n);

   /**
    * f0 -> "switch"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> "{"
    * f5 -> ( SwitchLabel() ( BlockStatement() )* )*
    * f6 -> "}"
    */
   public void visit(SwitchStatement n);

   /**
    * f0 -> "case" Expression() ":"
    *       | "default" ":"
    */
   public void visit(SwitchLabel n);

   /**
    * f0 -> "if"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> Statement()
    * f5 -> [ "else" Statement() ]
    */
   public void visit(IfStatement n);

   /**
    * f0 -> "while"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> Statement()
    */
   public void visit(WhileStatement n);

   /**
    * f0 -> "do"
    * f1 -> Statement()
    * f2 -> "while"
    * f3 -> "("
    * f4 -> Expression()
    * f5 -> ")"
    * f6 -> ";"
    */
   public void visit(DoStatement n);

   /**
    * f0 -> "for"
    * f1 -> "("
    * f2 -> [ ForInit() ]
    * f3 -> ";"
    * f4 -> [ Expression() ]
    * f5 -> ";"
    * f6 -> [ ForUpdate() ]
    * f7 -> ")"
    * f8 -> Statement()
    */
   public void visit(ForStatement n);

   /**
    * f0 -> LocalVariableDeclaration()
    *       | StatementExpressionList()
    */
   public void visit(ForInit n);

   /**
    * f0 -> StatementExpression()
    * f1 -> ( "," StatementExpression() )*
    */
   public void visit(StatementExpressionList n);

   /**
    * f0 -> StatementExpressionList()
    */
   public void visit(ForUpdate n);

   /**
    * f0 -> "break"
    * f1 -> [ <IDENTIFIER> ]
    * f2 -> ";"
    */
   public void visit(BreakStatement n);

   /**
    * f0 -> "continue"
    * f1 -> [ <IDENTIFIER> ]
    * f2 -> ";"
    */
   public void visit(ContinueStatement n);

   /**
    * f0 -> "return"
    * f1 -> [ Expression() ]
    * f2 -> ";"
    */
   public void visit(ReturnStatement n);

   /**
    * f0 -> "throw"
    * f1 -> Expression()
    * f2 -> ";"
    */
   public void visit(ThrowStatement n);

   /**
    * f0 -> "synchronized"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> Block()
    */
   public void visit(SynchronizedStatement n);

   /**
    * f0 -> "try"
    * f1 -> Block()
    * f2 -> ( "catch" "(" FormalParameter() ")" Block() )*
    * f3 -> [ "finally" Block() ]
    */
   public void visit(TryStatement n);

   /**
    * f0 -> "assert"
    * f1 -> Expression()
    * f2 -> [ ":" Expression() ]
    * f3 -> ";"
    */
   public void visit(AssertStatement n);

}

