DATA SEGMENT
	ROOTS DB '0.000','1.000',1.414','1.732','2.000'
	;					12345		678910			 	 16-20	
	INP DB 3
	OUT1 DB 5 DUP(?)
DATA ENDS

CODE SEGMENT
ASSUME CS:CODE,DS:DATA,SS:STACK
START:
	MOV AX,DATA
	MOV DS,AX

	MOV AH,1
	INT 21H
	;MOV AL,INP
	SUB AL,31H

	MOV BL,5
	MUL BL
	MOV CX,5
	MOV BX,AX
	OUT1: 	MOV AL,[ROOTS][BX]
					MOV DL,AL
					MOV AH,2
					INT 21H
				INC BX
		LOOP OUT1
		MOV AH,4CH
		INT 21H

		CODE ENDS
		END START
