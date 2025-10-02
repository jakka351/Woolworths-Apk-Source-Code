package com.benasher44.uuid;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.ranges.CharRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"uuid"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName
/* loaded from: classes4.dex */
public final class UuidUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final List f13691a = CollectionsKt.R(RangesKt.o(0, 8), RangesKt.o(9, 13), RangesKt.o(14, 18), RangesKt.o(19, 23), RangesKt.o(24, 36));
    public static final List b = CollectionsKt.R(8, 13, 18, 23);

    static {
        CollectionsKt.a0(new CharRange('0', '9'), new CharRange('a', 'f'));
    }
}
