/**
 * Copyright (c) 2000-2009 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portalweb.portlet.wiki;

import com.liferay.portalweb.portal.BaseTests;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * <a href="WikiTests.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public class WikiTests extends BaseTests {

	public static Test suite() {
		TestSuite testSuite = new TestSuite();

		testSuite.addTestSuite(AddPageTest.class);
		testSuite.addTestSuite(AddPortletTest.class);
		testSuite.addTestSuite(AddArticleTest.class);
		testSuite.addTestSuite(AddChildPageTest.class);
		testSuite.addTestSuite(AddSecondChildPageTest.class);
		testSuite.addTestSuite(AddNullTitleChildPageTest.class);
		testSuite.addTestSuite(AddSymbolTitleChildPageTest.class);
		testSuite.addTestSuite(AddDuplicateTitleChildPageTest.class);
		testSuite.addTestSuite(PreviewChildPageTest.class);
		testSuite.addTestSuite(CancelAddChildPageTest.class);
		testSuite.addTestSuite(MoveChangeParentTest.class);
		testSuite.addTestSuite(AddCommentTest.class);
		testSuite.addTestSuite(AddNullCommentTest.class);
		testSuite.addTestSuite(AddSecondCommentTest.class);
		testSuite.addTestSuite(EditCommentTest.class);
		testSuite.addTestSuite(RatingTest.class);
		testSuite.addTestSuite(DeleteCommentTest.class);
		testSuite.addTestSuite(AddAttachmentsTest.class);
		testSuite.addTestSuite(DeleteAttachmentsTest.class);
		testSuite.addTestSuite(SearchTitleTest.class);
		testSuite.addTestSuite(SearchContentTest.class);
		testSuite.addTestSuite(AddWikiNodeTest.class);
		testSuite.addTestSuite(AddNullNameWikiTest.class);
		testSuite.addTestSuite(AddNumberNameWikiTest.class);
		testSuite.addTestSuite(AddSymbolNameWikiTest.class);
		testSuite.addTestSuite(AddDuplicateNodeNameWikiTest.class);
		testSuite.addTestSuite(EditWikiNodeTest.class);
		testSuite.addTestSuite(AddSecondArticleTest.class);
		testSuite.addTestSuite(EditSecondArticleTest.class);
		testSuite.addTestSuite(MinorArticleChangeTest.class);
		testSuite.addTestSuite(CompareVersionsTest.class);
		testSuite.addTestSuite(RevertMinorArticleChangeTest.class);
		testSuite.addTestSuite(AddTemporaryArticleTest.class);
		testSuite.addTestSuite(DeleteArticleTest.class);
		testSuite.addTestSuite(CopyFrontPageTest.class);
		testSuite.addTestSuite(MovePageTest.class);
		testSuite.addTestSuite(RemoveRedirectTest.class);
		testSuite.addTestSuite(DisableCommentsTest.class);
		testSuite.addTestSuite(DisableRatingsTest.class);
		testSuite.addTestSuite(VisibleTest.class);
		testSuite.addTestSuite(AddNullVisibleTest.class);
		testSuite.addTestSuite(AddOrphanedArticlesTest.class);
		testSuite.addTestSuite(VerifyRecentChangesTest.class);
		testSuite.addTestSuite(VerifyAllPagesTest.class);
		testSuite.addTestSuite(VerifyOrphanedPagesTest.class);
		testSuite.addTestSuite(AddLinksTest.class);
		testSuite.addTestSuite(VerifyNoOrphanedPagesTest.class);
		testSuite.addTestSuite(VerifyPropertyLinksTest.class);
		testSuite.addTestSuite(VerifyPropertyHistoryTest.class);
		testSuite.addTestSuite(VerifyPageFormatTest.class);
		testSuite.addTestSuite(DeleteWikiNodeTest.class);
		testSuite.addTestSuite(ImportLARTest.class);
		testSuite.addTestSuite(AssertImportLARTest.class);
		testSuite.addTestSuite(TearDownTest.class);

		return testSuite;
	}
}