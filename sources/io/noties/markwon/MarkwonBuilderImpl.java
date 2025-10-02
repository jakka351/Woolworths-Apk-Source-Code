package io.noties.markwon;

import android.content.Context;
import android.widget.TextView;
import io.noties.markwon.Markwon;
import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.MarkwonSpansFactoryImpl;
import io.noties.markwon.MarkwonVisitorFactory;
import io.noties.markwon.MarkwonVisitorImpl;
import io.noties.markwon.core.MarkwonTheme;
import io.noties.markwon.image.AsyncDrawableLoader;
import io.noties.markwon.image.ImageSizeResolverDef;
import io.noties.markwon.image.destination.ImageDestinationProcessor;
import io.noties.markwon.syntax.SyntaxHighlightNoOp;
import io.noties.markwon.utils.Dip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.commonmark.parser.Parser;

/* loaded from: classes7.dex */
class MarkwonBuilderImpl implements Markwon.Builder {

    /* renamed from: a, reason: collision with root package name */
    public final Context f24185a;
    public final ArrayList b = new ArrayList(3);
    public final TextView.BufferType c = TextView.BufferType.SPANNABLE;
    public final boolean d = true;

    public MarkwonBuilderImpl(Context context) {
        this.f24185a = context;
    }

    @Override // io.noties.markwon.Markwon.Builder
    public final Markwon.Builder a(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            MarkwonPlugin markwonPlugin = (MarkwonPlugin) it.next();
            markwonPlugin.getClass();
            this.b.add(markwonPlugin);
        }
        return this;
    }

    @Override // io.noties.markwon.Markwon.Builder
    public final Markwon.Builder b(AbstractMarkwonPlugin abstractMarkwonPlugin) {
        this.b.add(abstractMarkwonPlugin);
        return this;
    }

    @Override // io.noties.markwon.Markwon.Builder
    public final Markwon build() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No plugins were added to this builder. Use #usePlugin method to add them");
        }
        RegistryImpl registryImpl = new RegistryImpl(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            registryImpl.c((MarkwonPlugin) it.next());
        }
        Parser.Builder builder = new Parser.Builder();
        Dip dip = new Dip(this.f24185a.getResources().getDisplayMetrics().density);
        MarkwonTheme.Builder builder2 = new MarkwonTheme.Builder();
        builder2.g = -1;
        builder2.h = -1;
        builder2.f = dip.a(8);
        builder2.b = dip.a(24);
        builder2.c = dip.a(4);
        builder2.d = dip.a(1);
        builder2.g = dip.a(1);
        builder2.h = dip.a(4);
        MarkwonConfiguration.Builder builder3 = new MarkwonConfiguration.Builder();
        MarkwonVisitorImpl.BuilderImpl builderImpl = new MarkwonVisitorImpl.BuilderImpl();
        MarkwonSpansFactoryImpl.BuilderImpl builderImpl2 = new MarkwonSpansFactoryImpl.BuilderImpl();
        ArrayList arrayList2 = registryImpl.b;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            MarkwonPlugin markwonPlugin = (MarkwonPlugin) it2.next();
            markwonPlugin.e(builder);
            markwonPlugin.j(builder2);
            markwonPlugin.f(builder3);
            markwonPlugin.c(builderImpl);
            markwonPlugin.d(builderImpl2);
        }
        MarkwonTheme markwonTheme = new MarkwonTheme(builder2);
        MarkwonSpansFactoryImpl markwonSpansFactoryImpl = new MarkwonSpansFactoryImpl(Collections.unmodifiableMap(builderImpl2.f24190a));
        builder3.f24187a = markwonTheme;
        builder3.g = markwonSpansFactoryImpl;
        if (builder3.b == null) {
            builder3.b = AsyncDrawableLoader.c();
        }
        if (builder3.c == null) {
            builder3.c = new SyntaxHighlightNoOp();
        }
        if (builder3.d == null) {
            builder3.d = new LinkResolverDef();
        }
        if (builder3.e == null) {
            builder3.e = ImageDestinationProcessor.a();
        }
        if (builder3.f == null) {
            builder3.f = new ImageSizeResolverDef();
        }
        MarkwonVisitorFactory.AnonymousClass1 anonymousClass1 = new MarkwonVisitorFactory.AnonymousClass1(builderImpl, new MarkwonConfiguration(builder3));
        return new MarkwonImpl(this.c, new Parser(builder), anonymousClass1, Collections.unmodifiableList(arrayList2), this.d);
    }
}
