/**
MIT License

Copyright (c) 2021 Surati

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */
package io.surati.gap.maccount.module.web.xe;

import com.minlessika.map.CleanMap;
import io.surati.gap.commons.utils.amount.FrAmountInXof;
import io.surati.gap.maccount.module.domain.api.DocumentToBundle;
import org.takes.rs.xe.XeDirectives;
import org.takes.rs.xe.XeWrap;
import org.xembly.Directives;

/**
 * Document to bundle xml.
 *
 * @since 3.0
 */
public final class XeDocumentToBundle extends XeWrap {

	public XeDocumentToBundle(final DocumentToBundle item) {
		this("item", item);
	}

	public XeDocumentToBundle(final String name, final DocumentToBundle item) {
		super(
			new XeDirectives(
				new Directives()
				.add(name)
				.add(
					new CleanMap<>()
						.add("id", item.id())
						.add("name", item.fullName())
						.add("bundle_id", item.maData().bundle().id())
						.add("bundle", item.maData().bundle().code())
						.add("title_id", item.maData().title().id())
						.add("title", item.maData().title().fullName())
						.add("section_id", item.maData().section().id())
						.add("section", item.maData().section().fullName())
						.add("imputation", item.maData().imputation())
						.add("year_of_payment", item.yearOfPayment())
						.add("annual_amount_paid", item.annualAmountPaid())
						.add("annual_amount_paid_in_human", new FrAmountInXof(item.annualAmountPaid()))
						.add("total_amount", item.totalAmount())
						.add("total_amount_in_human", new FrAmountInXof(item.totalAmount()))
						.add("left_amount", item.leftAmount())
						.add("left_amount_in_human", new FrAmountInXof(item.leftAmount()))
						.add("beneficiary", item.beneficiary().name())
				)
				.up()
			)
		);
	}
}
