package com.halilibo.richtext.ui;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/ui/RowBuilder;", "Lcom/halilibo/richtext/ui/RichTextTableCellScope;", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class RowBuilder implements RichTextTableCellScope {

    /* renamed from: a, reason: collision with root package name */
    public TableRow f16294a = new TableRow(EmptyList.d);

    @Override // com.halilibo.richtext.ui.RichTextTableCellScope
    public final void a(ComposableLambdaImpl composableLambdaImpl) {
        this.f16294a = new TableRow(CollectionsKt.d0(composableLambdaImpl, (Collection) this.f16294a.f16298a));
    }
}
