describe('template spec', () => {
  it('passes', () => {
    cy.visit('localhost:8080')
    cy.get(".btn").contains("Explore books").click()
    cy.get(".btn").eq(1).click()
    cy.get(".btn").contains("Checkout").click()
    cy.get("input[id='name']").type("John")
  })
})