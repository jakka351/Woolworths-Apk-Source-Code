package com.airbnb.epoxy;

import androidx.recyclerview.widget.DiffUtil;
import java.util.List;

/* loaded from: classes4.dex */
public class DiffResult {

    /* renamed from: a, reason: collision with root package name */
    public final List f13312a;
    public final List b;
    public final DiffUtil.DiffResult c;

    public DiffResult(List list, List list2, DiffUtil.DiffResult diffResult) {
        this.f13312a = list;
        this.b = list2;
        this.c = diffResult;
    }
}
