package io.noties.markwon;

import io.noties.markwon.image.ImageProps;
import java.util.HashMap;

/* loaded from: classes7.dex */
class RenderPropsImpl implements RenderProps {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f24197a = new HashMap(3);

    @Override // io.noties.markwon.RenderProps
    public final void a(Prop prop, Object obj) {
        HashMap map = this.f24197a;
        if (obj == null) {
            map.remove(prop);
        } else {
            map.put(prop, obj);
        }
    }

    @Override // io.noties.markwon.RenderProps
    public final Object b(Prop prop) {
        return this.f24197a.get(prop);
    }

    @Override // io.noties.markwon.RenderProps
    public final Object get() {
        Boolean bool = Boolean.FALSE;
        Object obj = this.f24197a.get(ImageProps.b);
        return obj != null ? obj : bool;
    }
}
