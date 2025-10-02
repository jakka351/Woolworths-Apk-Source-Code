package com.halilibo.richtext.ui;

import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/ui/TableBuilder;", "Lcom/halilibo/richtext/ui/RichTextTableRowScope;", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TableBuilder implements RichTextTableRowScope {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f16295a = new ArrayList();

    @Override // com.halilibo.richtext.ui.RichTextTableRowScope
    public final void a(com.halilibo.richtext.markdown.c cVar) {
        RowBuilder rowBuilder = new RowBuilder();
        cVar.invoke(rowBuilder);
        this.f16295a.add(rowBuilder);
    }
}
