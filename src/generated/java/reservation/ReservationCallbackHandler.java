/**
 * ReservationCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package reservation;


/**
 *  ReservationCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class ReservationCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public ReservationCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public ReservationCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for getReservation method
     * override this method for handling normal response from getReservation operation
     */
    public void receiveResultgetReservation(
        GetReservationResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getReservation operation
     */
    public void receiveErrorgetReservation(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getDisponibilita method
     * override this method for handling normal response from getDisponibilita operation
     */
    public void receiveResultgetDisponibilita(
        GetDisponibilitaResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getDisponibilita operation
     */
    public void receiveErrorgetDisponibilita(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getScali method
     * override this method for handling normal response from getScali operation
     */
    public void receiveResultgetScali(
        GetScaliResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getScali operation
     */
    public void receiveErrorgetScali(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for annullaPren method
     * override this method for handling normal response from annullaPren operation
     */
    public void receiveResultannullaPren(
        AnnullaPrenResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from annullaPren operation
     */
    public void receiveErrorannullaPren(Exception e) {
    }
}
