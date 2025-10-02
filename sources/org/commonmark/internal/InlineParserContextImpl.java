package org.commonmark.internal;

import java.util.List;
import java.util.Set;
import org.commonmark.parser.InlineParserContext;

/* loaded from: classes8.dex */
public class InlineParserContextImpl implements InlineParserContext {

    /* renamed from: a, reason: collision with root package name */
    public final List f26831a;
    public final List b;
    public final List c;
    public final Set d;
    public final Definitions e;

    public InlineParserContextImpl(List list, List list2, List list3, Set set, Definitions definitions) {
        this.f26831a = list;
        this.b = list2;
        this.c = list3;
        this.d = set;
        this.e = definitions;
    }
}
