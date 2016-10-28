package studentOrientation.attributes;

import studentOrientation.enums.BookStore;
import studentOrientation.enums.CampusTour;
import studentOrientation.enums.DormSelector;
import studentOrientation.enums.Registration;

public class Duration implements DurationI {
  double value;
  public void addDurationMinutes(BookStore bookStoreIn) {
    if(activityIn == BookStore.mandoBooks) { minutes = 15; }
    else if(activityIn == BookStore.buBookStore) { minutes = 25; }
    return value;
  }
  public void addDurationMinutes(CampusTour tourIn) {
    if(activityIn == CampusTour.busRide) { minutes = 45; }
    else if(activityIn == CampusTour.onFoot) { minutes = 90; }
    return value;
  }
  public void addDurationMinutes(DormSelector dormIn) {
    if(activityIn == DormSelector.standOutside) { minutes = 120; }
    else if(activityIn == DormSelector.gamingContest) { minutes = 45; }
    return value;
  }
  public void addDurationMinutes(Registration registrationIn) {
    if(activityIn == Registration.computerLab) { minutes = 15; }
    else if(activityIn == Registration.registrar) { minutes = 15; }
    return minutes;
  }
}
