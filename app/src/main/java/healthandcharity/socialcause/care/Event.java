package healthandcharity.socialcause.care;

/*
 This layout file was made by Ayush Gupta.
 This file is a part of Care app.
 Care is an app developed for project in curriculum, to be submitted to
 the college. The college holds no rights, whatsoever, on the distribution
 or the modification of the content of the app in neither of the
 app GUI, the database, not the functionality..
 */

public class Event {

    String eventName,eventLocation,eventCrowdNumber,eventDate,eventMonth;

    public Event(String eventName,String eventLocation,String eventCrowdNumber,String eventDate,String eventMonth){
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventCrowdNumber = eventCrowdNumber;
        this.eventDate = eventDate;
        this.eventMonth = eventMonth;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getEventCrowdNumber() {
        return eventCrowdNumber;
    }

    public void setEventCrowdNumber(String eventCrowdNumber) {
        this.eventCrowdNumber = eventCrowdNumber;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventMonth() {
        return eventMonth;
    }

    public void setEventMonth(String eventMonth) {
        this.eventMonth = eventMonth;
    }
}
