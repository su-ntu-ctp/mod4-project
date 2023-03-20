package sg.edu.ntu.m3project.m3project.entity;

import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="itineraries")
public class Itinerary {

   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Integer id;

   @ManyToOne
   @JoinColumn(name="user_id")
   private User user;

   @ManyToOne
   @JoinColumn(name="transport_id")
   private Transport transportId;

   @ManyToOne
   @JoinColumn(name="accommodation_id")
   private Accommodation accommodationId;

   @ManyToOne
   @JoinColumn(name="destination_id")
   private Destination destinationId;

   @Column(name="start_date")
   private Date startDate;

   @Column(name="end_date")
   private Date endDate;

   @Column(name="budget")
   private Float budget;

   @Column(name="created_at", updatable= false)
   private Timestamp createdAt = new Timestamp(new Date().getTime());


   //#region Getters and Setters
   public Integer getId() {
     return id;
   }

   public void setId(Integer id) {
     this.id = id;
   }

   public User getUser() {
     return user;
   }

   public void setUser(User user) {
     this.user = user;
   }

   public Transport getTransportId() {
     return transportId;
   }

   public void setTransportId(Transport transportId) {
     this.transportId = transportId;
   }

   public Accommodation getAccommodationId() {
     return accommodationId;
   }

   public void setAccommodationId(Accommodation accommodationId) {
     this.accommodationId = accommodationId;
   }

   public Destination getDestinationId() {
     return destinationId;
   }

   public void setDestinationId(Destination destinationId) {
     this.destinationId = destinationId;
   }

   public Date getStartDate() {
     return startDate;
   }

   public void setStartDate(Date startDate) {
     this.startDate = startDate;
   }

   public Date getEndDate() {
     return endDate;
   }

   public void setEndDate(Date endDate) {
     this.endDate = endDate;
   }

   public Float getBudget() {
     return budget;
   }

   public void setBudget(Float budget) {
     this.budget = budget;
   }

   public Timestamp getCreatedAt() {
     return createdAt;
   }

   public void setCreatedAt(Timestamp createdAt) {
     this.createdAt = createdAt;
   }
   //#endregion
}
