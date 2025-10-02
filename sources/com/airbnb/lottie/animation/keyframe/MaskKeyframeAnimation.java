package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class MaskKeyframeAnimation {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13373a;
    public final ArrayList b;
    public final List c;

    public MaskKeyframeAnimation(List list) {
        this.c = list;
        this.f13373a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f13373a.add(((Mask) list.get(i)).b.g());
            this.b.add(((Mask) list.get(i)).c.g());
        }
    }
}
