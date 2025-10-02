package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* JADX WARN: Method from annotation default annotation not found: deferred */
/* JADX WARN: Method from annotation default annotation not found: onDelete */
/* JADX WARN: Method from annotation default annotation not found: onUpdate */
@Target({})
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0002\u000f\u0010BM\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/room/ForeignKey;", "", "Lkotlin/reflect/KClass;", "entity", "", "", "parentColumns", "childColumns", "", "onDelete", "onUpdate", "", "deferred", "<init>", "(Lkotlin/reflect/KClass;Lkotlin/Array;Lkotlin/Array;IIZ)V", "Action", "Companion", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.annotation.Target
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention
/* loaded from: classes2.dex */
public @interface ForeignKey {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/room/ForeignKey$Action;", "", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.CLASS)
    @kotlin.annotation.Retention
    public @interface Action {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/ForeignKey$Companion;", "", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }
}
