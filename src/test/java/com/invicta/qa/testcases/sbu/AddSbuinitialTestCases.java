//***********************************************************************************
//* Description
//*------------
//* Add Sbu functionaltiy
//***********************************************************************************
//*
//* Author           : Wathsala Weerakoon
//* Date Written     : 17/02/2023
//* 
//*
//* 
//* Test Case Number       Date         Intis        Comments
//* ================       ====         =====        ========
//*                        17/02/2023   Wathsala     Orginal Version
//*
//************************************************************************************

package com.invicta.qa.testcases.sbu;

import java.io.IOException;

import org.testng.annotations.Test;

import com.invicta.qa.pages.sbu.AddSbuFunPage;
import com.invicta.qa.pages.sbu.AddSbuUIPage;

public class AddSbuinitialTestCases extends AddSbuInitialTest {
	
	static AddSbuFunPage addfunctionpg = new AddSbuFunPage();
	static AddSbuUIPage addfun = new AddSbuUIPage();

	@Test
	public static void testcase() throws InterruptedException, IOException
	
	{
		// STEP-1 "ADD SBU BUTTON" PROPERTIES
		//001-ADD-SBU-BUTTON-DISPLAYED,002-ADD-SBU-BUTTON-ENABLED,003-ADD-SBU-BUTTON-POSITION,004-ADD-SBU-BUTTON-FONT-SIZE
		//005-ADD-SBU-BUTTON-SIZE,006-ADD-SBU-BUTTON-COLOUR,007-ADD-SBU-BUTTON-BORDER-COLOUR,008-ADD-SBU-BUTTON-FONT-COLOUR
		//009-ADD-SBU-BUTTON-FONT-TYPE,010-ADD-SBU-BUTTON-TEXT,011-ADD-SBU-BUTTON-CURSOR-TYPE,012-ADD-SBU-BUTTON-SHAPE,
		//013-ADD-SBU-BUTTON-BOX-SHADOW,014-ADD-SBU-BUTTON-PADDING,
		AddSbuInitialTest.addSbuButtonproperties();
		
		// STEP-2 CLICK ON "ADD SBU" BUTTON
		//AddSbuUIPage.SBUbutton.click();
		AddSbuInitialTest.addSubButtonClick();
		
		// STEP-3  "ADD SBU" DIALOGBOX PROPERTIES
		//015-ADD-SBU-MODAL-VISIBLE,016-ADD-SBU-MODAL-POSITION,017-ADD-SBU-MODAL-SIZE,018-ADD-SBU-MODAL-BACKGROUND-COLOR
		//019-ADD-SBU-MODAL-BORDER-COLOR,020-ADD-SBU-MODAL-OVERFLOW-TYPE,021-ADD-SBU-MODAL-MARGIN-TYPE,022-ADD-SBU-MODAL-CURSOR-TYPE
		//023-ADD-SBU-MODAL-Z-INDEX-TYPE,024-ADD-SBU-MODAL-HEADER,025-ADD-SBU-MODAL-CONTENT,026-MODAL-INVISIBLE-ONCLICK-INSIDE
		AddSbuInitialTest.addSbuModalproperties();
		
		// STEP-4 DATA FROM EXCEL
		AddSbuInitialTest.getdatefromExcel();
		
		// STEP-5 "SAVE BUTTON" PROPERTIES
		//027-SAVE-BUTTON-DISPLAYED,028-SAVE-BUTTON-ENABLED,029-SAVE-BUTTON-POSITION,030-SAVE-BUTTON-FONT-SIZE
		//031-SAVE-BUTTON-SIZE,032-SAVE-BUTTON-COLOUR,033-SAVE-BUTTON-BORDER-COLOUR,034-SAVE-BUTTON-FONT-COLOUR
		//035-SAVE-BUTTON-FONT-TYPE,036-SAVE-SBU-BUTTON-TEXT,037-SAVE-BUTTON-CURSOR-TYPE,038-SAVE-BUTTON-SHAPE
		//039-SAVE-BUTTON-BOX-SHADOW,040-SAVE-BUTTON-PADDING,
		AddSbuInitialTest.saveButtonProperties();
		
		// STEP-6 CLICK ON "SAVE BUTTON"
		//AddSbuFunPage.SBUsavebutton.click();
		AddSbuInitialTest.saveButtonClick();
		
		//STEP-7 CHECK THE ENTERED VALUE HAS SAVED IN FIRST OF THE TABLE
		AddSbuInitialTest.checkLastAddvalue();
		
		
		
	}
	
}

