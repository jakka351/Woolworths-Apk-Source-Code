package io.noties.markwon;

import io.noties.markwon.MarkwonSpansFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
class MarkwonSpansFactoryImpl implements MarkwonSpansFactory {

    /* renamed from: a, reason: collision with root package name */
    public final Map f24189a;

    public static class BuilderImpl implements MarkwonSpansFactory.Builder {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f24190a = new HashMap(3);

        @Override // io.noties.markwon.MarkwonSpansFactory.Builder
        public final MarkwonSpansFactory.Builder a(Class cls, SpanFactory spanFactory) {
            HashMap map = this.f24190a;
            SpanFactory spanFactory2 = (SpanFactory) map.get(cls);
            if (spanFactory2 == null) {
                map.put(cls, spanFactory);
                return this;
            }
            if (spanFactory2 instanceof CompositeSpanFactory) {
                ((CompositeSpanFactory) spanFactory2).f24191a.add(0, spanFactory);
                return this;
            }
            map.put(cls, new CompositeSpanFactory(spanFactory, spanFactory2));
            return this;
        }

        @Override // io.noties.markwon.MarkwonSpansFactory.Builder
        public final MarkwonSpansFactory.Builder b(Class cls, SpanFactory spanFactory) {
            this.f24190a.put(cls, spanFactory);
            return this;
        }
    }

    public static class CompositeSpanFactory implements SpanFactory {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f24191a;

        public CompositeSpanFactory(SpanFactory spanFactory, SpanFactory spanFactory2) {
            ArrayList arrayList = new ArrayList(3);
            this.f24191a = arrayList;
            arrayList.add(spanFactory);
            arrayList.add(spanFactory2);
        }

        @Override // io.noties.markwon.SpanFactory
        public final Object a(MarkwonConfiguration markwonConfiguration, RenderProps renderProps) {
            ArrayList arrayList = this.f24191a;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                objArr[i] = ((SpanFactory) arrayList.get(i)).a(markwonConfiguration, renderProps);
            }
            return objArr;
        }
    }

    public MarkwonSpansFactoryImpl(Map map) {
        this.f24189a = map;
    }

    @Override // io.noties.markwon.MarkwonSpansFactory
    public final SpanFactory a(Class cls) {
        return (SpanFactory) this.f24189a.get(cls);
    }
}
