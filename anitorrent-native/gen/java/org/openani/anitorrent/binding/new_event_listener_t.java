/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.2.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.openani.anitorrent.binding;

public class new_event_listener_t {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected new_event_listener_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(new_event_listener_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(new_event_listener_t obj) {
    long ptr = 0;
    if (obj != null) {
      if (!obj.swigCMemOwn)
        throw new RuntimeException("Cannot release ownership as memory is not owned");
      ptr = obj.swigCPtr;
      obj.swigCMemOwn = false;
      obj.delete();
    }
    return ptr;
  }

  @SuppressWarnings({"deprecation", "removal"})
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        anitorrentJNI.delete_new_event_listener_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    anitorrentJNI.new_event_listener_t_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    anitorrentJNI.new_event_listener_t_change_ownership(this, swigCPtr, true);
  }

  public void on_new_events() {
    if (getClass() == new_event_listener_t.class) anitorrentJNI.new_event_listener_t_on_new_events(swigCPtr, this); else anitorrentJNI.new_event_listener_t_on_new_eventsSwigExplicitnew_event_listener_t(swigCPtr, this);
  }

  public new_event_listener_t() {
    this(anitorrentJNI.new_new_event_listener_t(), true);
    anitorrentJNI.new_event_listener_t_director_connect(this, swigCPtr, true, true);
  }

}
